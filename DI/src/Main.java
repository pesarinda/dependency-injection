public class Main {
    public static void main(String[] args) {
        emailchannel e = new emailchannel();
        alertSystem one = new alertSystem(e);
        one.raiseAlert();

        smschannel s = new smschannel();
        alertSystem two = new alertSystem(s);
        two.raiseAlert();

        pushchannel p = new pushchannel();
        alertSystem three = new alertSystem(p);
        three.raiseAlert();
    }
}
