/*
 *  COMP2007 Demo Software (2010)
 */
package problem3;

/**
 * Simulates a bee that forever adds portions of honey to a honeypot.
 *
 * @author kevin-b
 */
class Bee extends Thread {

    private int id;
    private HoneyPot pot;

    /**
     * Class constructor.
     * @param id	Unique identifier for the bee.
     * @param pot	Honey pot that the bee adds honey to.
     */
    public Bee(final int id, final HoneyPot pot) {
        this.id = id;
        this.pot = pot;
    }

    public int getBeeId() {
        return id;
    }

    public void run() {

        System.out.println("Bee " + id + " running (flying ?)");

        try {
            while (true) {
                pot.addPortionOfHoney(this);

                // Collecting more honey ...
                sleep(5000);
            }
        } catch (InterruptedException except) {
            System.out.println("Bee " + id + " was interrupted.");
        }
    }
}
