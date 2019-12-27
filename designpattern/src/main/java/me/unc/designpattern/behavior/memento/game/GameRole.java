package me.unc.designpattern.behavior.memento.game;

//游戏角色
public class GameRole {
    //攻击力
    private int vit;
    //防御力
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    //创建按Memento，即当前的状态得到Memento
    public Memento createMemento() {
        return new Memento(this.vit, this.def);
    }

    //从备忘录对象，恢复GameRole的状态
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    //显示当前攻击力和防御力
    public void display() {
        System.out.println("游戏角色当前的攻击力：" + this.vit + "  " +
                "防御力：" + this.def);
    }

}
