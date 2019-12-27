package me.unc.designpattern.behavior.memento.game;

/**
 * 备忘录模式 --游戏角色恢复状态实例
 */
public class Client {
    public static void main(String[] args) {
        //创建游戏角色，初始化100攻防
        GameRole gameRole = new GameRole();
        gameRole.setDef(100);
        gameRole.setVit(100);

        System.out.println("和boss大战前的状态");
        gameRole.display();

        //保存当前状态到Caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("\n" + "=====和boss大战====");
        gameRole.setVit(60);
        gameRole.setDef(60);

        System.out.println("====游戏角色状态===");
        gameRole.display();

        System.out.println("\n");

        System.out.println("===大战后，是由备忘录对象恢复到战前===");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());

        System.out.println("=====恢复后的状态=====");
        gameRole.display();

    }
}
