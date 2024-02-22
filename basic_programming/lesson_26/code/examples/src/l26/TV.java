package l26;

public abstract class TV {
    protected int soundValue = 100;

    abstract void enable();
    abstract void disable();
    abstract void nextChannel();
    abstract void previousChannel();
    abstract void soundUp();
    abstract void soundDown();

    public void mute() {
        while (this.soundValue > 0) {
            this.soundDown();
        }
    }
}


class HuaweiTV954 extends TV {
    @Override
    void enable() {
        System.out.println("HuaweiTV954 enable");
    }

    @Override
    void disable() {
        System.out.println("HuaweiTV954 disable");
    }

    @Override
    void nextChannel() {
        System.out.println("HuaweiTV954 nextChannel");
    }

    @Override
    void previousChannel() {
        System.out.println("HuaweiTV954 previousChannel");
    }

    @Override
    void soundUp() {
        System.out.println("HuaweiTV954 soundUp");
    }

    @Override
    void soundDown() {
        this.soundValue = this.soundValue - 10;
        this.soundValue = Math.max(this.soundValue, 0);
        System.out.println("HuaweiTV954 soundDown: " + this.soundValue);
    }

}


class SamsungTV3214 extends TV {
    @Override
    void enable() {
        System.out.println("SamsungTV3214 enable");
    }

    @Override
    void disable() {
        System.out.println("SamsungTV3214 disable");
    }

    @Override
    void nextChannel() {
        System.out.println("SamsungTV3214 nextChannel");
    }

    @Override
    void previousChannel() {
        System.out.println("SamsungTV3214 previousChannel");
    }

    @Override
    void soundUp() {
        System.out.println("SamsungTV3214 soundUp");
    }

    @Override
    void soundDown() {
        this.soundValue = this.soundValue - 7;
        this.soundValue = Math.max(this.soundValue, 0);
        System.out.println("SamsungTV3214 soundDown: " + this.soundValue);
    }
}


class MyFlat {
    public static void main(String[] args) {
        TV samsung = new SamsungTV3214();
        TV huawei = new HuaweiTV954();
        // TV tv = new TV(); // fail

        samsung.enable();
        huawei.enable();
        samsung.mute();
        huawei.mute();
    }
}