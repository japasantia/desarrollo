package ve.gob.cendit.cenditlab.data;

import java.util.Arrays;

public class FieldUnits
{
    public static final FieldUnits EMPTY_UNITS =
            new FieldUnits(Unit.EMPTY_UNIT);

    private final Unit[] units;

    public FieldUnits(Unit... units)
    {
        if (units == null || units.length == 0)
            throw new IllegalArgumentException("units must not be empty");

        this.units = units;
    }

    public Unit[] getUnits()
    {
        return units;
    }

    public String[] getUnitNames()
    {
        return (String[]) Arrays.stream(units)
                .map(unit -> unit.getName())
                .toArray();
    }

    public Unit getUnitForMagnitude(float magnitude)
    {
        Unit unit = Unit.EMPTY_UNIT;

        for (Unit u : units)
        {
            if (magnitude > u.getMultiplier())
                unit = u;
        }

        return unit;
    }

    public Unit get(String name)
    {
        Unit unit = null;

        for (Unit u : units)
        {
            if (name == u.getName())
                return u;
        }

        throw new IllegalArgumentException("name not exists as unit for this field");

        /*
        Optional<ve.gob.cendit.cenditlab.data.Unit> result = Arrays.stream(units)
                .filter(u -> name == u.getName())
                .findFirst();

        if (result.isPresent())
        {
            return result.get();
        }
        */
    }

    public Unit get(int index)
    {
        return units[index];
    }
}
