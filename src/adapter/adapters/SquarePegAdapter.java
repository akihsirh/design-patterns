package adapter.adapters;

import adapter.round.RoundPeg;
import adapter.square.SquarePeg;

/**
 * Helps square pegs fit into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter( SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    /**
     * Calculates the minimum hole radius needed to fit the square peg.
     * @return the minimum circle radius.
     */
    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
        return result;
    }
}
