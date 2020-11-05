package shilkin;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        UI scene = new UI();
        Random random = new Random();
        TextField textX = new TextField(4, 20, 2, 4, "Координата x для нового элемента", true, String.valueOf(getRandomRange(0, 100)));
        TextField textY = new TextField(12, 20, 2, 4, "Координата y для нового элемента", true, String.valueOf(getRandomRange(0, 100)));
        Button button = new Button(5, 5, 3, 4, "Добавить элемент", true, rectangle -> {
            int element = random.nextInt(3);
            try {
                scene.addElement(textX);
                switch (element) {
                    case 0 -> scene.addElement(new Button(Integer.parseInt(textX.getInputText()), Integer.parseInt(textY.getInputText()), getRandomRange(1, 10), getRandomRange(1, 10), "Кнопка в координатах " + textX + "," + textY, true, newRectangle -> System.out.println("Нажата кнопка в координатах " + textX + "," + textY)));
                    case 1 -> scene.addElement(new CheckBox(Integer.parseInt(textX.getInputText()), Integer.parseInt(textY.getInputText()), getRandomRange(1, 10), getRandomRange(1, 10), "Кнопка в координатах " + textX + "," + textY, true, random.nextBoolean()));
                    case 2 -> scene.addElement(new TextField(Integer.parseInt(textX.getInputText()), Integer.parseInt(textY.getInputText()), getRandomRange(1, 10), getRandomRange(1, 10), "Кнопка в координатах " + textX + "," + textY, true, getRandomString()));
                }
            } catch (ElementsOverlapException elementsOverlapException) {
                elementsOverlapException.printStackTrace();
            }
        });
//
        try {
            scene.addElement(textX);
            scene.addElement(textY);
            scene.addElement(button);
        } catch (ElementsOverlapException elementsOverlapException) {
            elementsOverlapException.printStackTrace();
        }
        button.click();

        textX.setInputText(String.valueOf(random.nextInt(100)));
        textY.setInputText(String.valueOf(random.nextInt(100)));
        button.click();

        textX.setInputText(String.valueOf(random.nextInt(100)));
        textY.setInputText(String.valueOf(random.nextInt(100)));
        button.click();

        textX.setInputText(String.valueOf(random.nextInt(100)));
        textY.setInputText(String.valueOf(random.nextInt(100)));
        button.click();

        textX.setInputText(String.valueOf(random.nextInt(100)));
        textY.setInputText(String.valueOf(random.nextInt(100)));
        button.click();

        textX.setInputText(String.valueOf(random.nextInt(100)));
        textY.setInputText(String.valueOf(random.nextInt(100)));
        button.click();

        textX.setInputText(String.valueOf(random.nextInt(100)));
        textY.setInputText(String.valueOf(random.nextInt(100)));
        button.click();

        textX.setInputText(String.valueOf(random.nextInt(100)));
        textY.setInputText(String.valueOf(random.nextInt(100)));
        button.click();

        textX.setInputText(String.valueOf(random.nextInt(100)));
        textY.setInputText(String.valueOf(random.nextInt(100)));
        button.click();

        textX.setInputText(String.valueOf(random.nextInt(100)));
        textY.setInputText(String.valueOf(random.nextInt(100)));
        button.click();

        textX.setInputText(String.valueOf(random.nextInt(100)));
        textY.setInputText(String.valueOf(random.nextInt(100)));


        for (int i = 0; i < scene.getAllElements().length; i++) {
            System.out.println(scene.getAllElements()[i].toString());
            if ((scene.getAllElements()[i] instanceof Button || scene.getAllElements()[i] instanceof CheckBox) && i != 2) {
                scene.getAllElements()[i].click();
                if (scene.getAllElements()[i] instanceof CheckBox) {
                    ((CheckBox) scene.getAllElements()[i]).isPressed();
                }
            } else if (scene.getAllElements()[i] instanceof TextField) {
                ((TextField) scene.getAllElements()[i]).getInputText();
            }
        }

    }

    static String getRandomString() {
        int maxLength = 10;
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(maxLength);
        for (int i = 0; i < maxLength; i++) {
            int index = (int) (letters.length() * Math.random());
            sb.append(letters.charAt(index));
        }
        return sb.toString();
    }

    static int getRandomRange(int min, int max) {
        Random random = new Random();
        int diff = max - min;
        return random.nextInt(diff) + 1 + min;
    }
}
