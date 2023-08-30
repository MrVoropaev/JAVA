package Classes;

import Classes.Rewards.*;

import java.util.Scanner;

public class RewardGetter {
    private static RewardGetter rewardGetter;
    private static ItemFactory factory;
    private static ItemFactory factory1;
    private static ItemFactory factory3;
    private static ItemFactory factory4;
    private static ItemFactory factory5;
    private static ItemFactory factory6;
    private static ItemFactory factory7;

    private RewardGetter() {
        factory = new GoldGenerator();
        factory1 = new GemGenerator();
        factory3 = new CoilGenerator();
        factory4 = new RockGenerator();
        factory5 = new AmetistGenerator();
        factory6 = new SilverGenerator();
        factory7 = new GlassGenerator();
    }

    public static RewardGetter getInstance() {
        if (rewardGetter == null) {
            rewardGetter = new RewardGetter();
        }
        return rewardGetter;
    }

    public void listen() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите:  от 1 до 7 для получения награды,\nили exit для выхода.");
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) break;
            switch (cmd) {
                case ("1") -> factory.openReward();
                case ("2") -> factory1.openReward();
                case ("3") -> factory3.openReward();
                case ("4") -> factory4.openReward();
                case ("5") -> factory5.openReward();
                case ("6") -> factory6.openReward();
                case ("7") -> factory7.openReward();
            }
        }
        sc.close();
    }
}
