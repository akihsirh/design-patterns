package adapter.round;

/**
 *
 * RoundHoles are compatible with RoundPegs.
 *
 */
public class RoundHole {
    private double radius;

    public RoundHole(float radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param roundPeg the round peg object
     * @return checks if the peg fits in the hole.
     */
    public boolean fits(RoundPeg roundPeg) {
        boolean fit;
        fit = (this.getRadius() >= roundPeg.getRadius());
        return fit;
    }
}
