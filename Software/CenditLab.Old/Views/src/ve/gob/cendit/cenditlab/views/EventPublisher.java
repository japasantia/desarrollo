package ve.gob.cendit.cenditlab.views;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EventPublisher
{
    private Map<Integer, List<IEventFunction>> eventFunctionsMap;

    public EventPublisher()
    {

    }

    protected EventPublisher(Object owner)
    {

    }

    protected void publishEvent(int eventId)
    {
        if (eventFunctionsMap == null)
        {
            eventFunctionsMap = new HashMap<Integer, List<IEventFunction>>();
        }

        eventFunctionsMap.put(eventId,  new LinkedList<IEventFunction>());
    }


    public void subscribeEvent(int eventId, IEventFunction eventFunction)
    {
        if (eventFunction != null && hasEvent(eventId))
        {
            getEventFunctions(eventId).add(eventFunction);
        }
    }

    public void unsubscriveEvent(int eventId, IEventFunction eventFunction)
    {
        if (eventFunction != null && hasEvent(eventId))
        {
            getEventFunctions(eventId).remove(eventFunction);
        }
    }

    public boolean hasEvent(int eventId)
    {
        return eventFunctionsMap != null && eventFunctionsMap.containsKey(eventId);
    }

    protected void raiseEvent(int eventId, Object... eventArgs)
    {
        if (eventFunctionsMap.containsKey(eventId))
        {
            getEventFunctions(eventId).stream()
                .forEach(eventFunction -> eventFunction.handle(eventArgs));
        }
    }

    private List<IEventFunction> getEventFunctions(int eventId)
    {
        List<IEventFunction> eventFunctionList =
                eventFunctionsMap.get(eventId);

        return eventFunctionList;
    }
}
