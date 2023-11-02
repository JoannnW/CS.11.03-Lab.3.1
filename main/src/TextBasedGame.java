import java.util.Scanner;

public class main {
    private static int detectivePoints = 0;

    private static String getPlayerName(Scanner scanner) {
        System.out.println("Enter your last name: ");
        return scanner.nextLine();
    }

    //crime scene games (3)
    private static String crimeSceneQ1(int cs1scan) {
        if (cs1scan == 1) {
            detectivePoints++;
            return "Spot on! \nDelivering your first pack of clues in the crime scene...\n \n1. George Graham has a black eye and bruises on his body. \nThere is a  ripped up love letter in the bin from 'D' to 'AG'\n";
        } else if (cs1scan < 1) {
            return "400°C in the oven!";
        } else if (cs1scan >= 2 && cs1scan <= 5) {

            return "Your forehead starts burning up with a fever.";
        } else if (cs1scan >= 6 && cs1scan <= 10) {
            return "A gust of wind flies past you.";
        } else if (cs1scan >= 11 && cs1scan <= 20) {
            return "\"Ice Ice Baby\" starts playing in your head as you find yourself shivering in the presence of Santa Claus.";
        }
        return "hmm make sure your number is within 1-20";
    }


    private static String crimeSceneQ2(int cs2scan) {
        String CS2result ="";
        if (cs2scan == 15) {
            detectivePoints++;
            CS2result = "\n \n You certainly have a way with numbers! Here's your well deserved second pacl of clues... \n2.  George Graham's coffee mug is empty, next to it is the empty instant coffee packet. \nThere's some leftover coffee powder, upon closer inspection, u see that it’s mixed with a mysterious white powder\n \n";
            return CS2result;
        } else {
            CS2result= "Aha, there must be a typo there. Obviously. (It's not correct)";
            return CS2result;
        }
    }
    private static String crimeSceneQ3(String cs3scan, String cs3scan2, String cs3scan3) {
        System.out.println("---Mini game: Unscramble the word---");
        System.out.println("1. eomoapaintoo 2.otiacpr 3.logoi");
        String CS3result="";
        if (cs3scan.equals("onomatopoeia")) {
            CS3result="Congrats! That was a tough one. 2 more to go!";
        } else {
            CS3result="Erm.. check again..";
        }
        System.out.println("2. otiacpr");
        if (cs3scan2.equals("apricot")) {
            CS3result="Nice! Move on to the last word.";
        } else {
            CS3result="Erm.. check again..";
        }
        System.out.println("3. logoi");
        if (cs3scan3.equals("igloo")) {
            detectivePoints++;
            CS3result="Woo! You made it. Your third pack of clues within the crime scene... \n3. The state of his office (murder scene) is messy when it’s usually organized. \nAmong the pile of paperwork, you see a marriage contract. \nYou quickly notice the following: \n1. Beatrice's dad seems to have altered the standard marriage agreement between Beatrice and Connor. \n2. There is a statement in a smaller font in the back of the page stating that \nif the couple divorced, Connor would have to forfeit his entire fortune, \nwhile the rightful share of half his wealth would be claimed by the Graham household.\n3. Connor seemed to have signed this contract without reading it thoroughly.";
        } else {
            CS3result="Erm..check again..";
        }
        return CS3result;
    }
    //rooms games 1/4 - Alisha
    private static String birthday(String bday1, String bday2, String bday3){
        if (bday1.equalsIgnoreCase("May 2 1972")){
            detectivePoints++;
            return"Do you know that emerald is the Taurus Birthstone?\n\nIn Alisha's room, there's a diary and a bottle of sleeping pills. \nThe most recent diary entry says: \n\"This is horrid, absolutely horrid! Why, that old man, \nthat wretched girL! To think that he would choose \na girl he picked up out of nowhere over his own daughter! \nHe even told me to my face that he'd go right down to \nhis lawyers tomorrow evening to change his inheritance letter\n so that she will own everything. And if not,\n he will throw his money to charities. Charities! \nI am in great distress and will need to clear my head somewhere in the house.\"";
        }
        else {
            System.out.println("Aw man, the Rock won't be happy about this..\n Let's see if you know the next one.");
            if (bday2.equalsIgnoreCase("Feb 4 2008")){
                detectivePoints++;
                return"I guess you can say you're sole mates.\nIn Alisha's room, there's a diary and a bottle of sleeping pills. \nThe most recent diary entry says: \n\"This is horrid, absolutely horrid! Why, that old man, \nthat wretched girL! To think that he would choose \na girl he picked up out of nowhere over his own daughter! \nHe even told me to my face that he'd go right down to \nhis lawyers tomorrow evening to change his inheritance letter\n so that she will own everything. And if not,\n he will throw his money to charities. Charities! \nI am in great distress and will need to clear my head somewhere in the house.\"";
            }
            else{
                System.out.println("Time to go to the boot camp..\n Let's see if you know the next one.");
                if (bday3.equalsIgnoreCase("Dec 25")){
                    detectivePoints++;
                    return"Imagine getting Christmas presents on top of birthday gifts.\n In Alisha's room, there's a diary and a bottle of sleeping pills. \nThe most recent diary entry says: \n\"This is horrid, absolutely horrid! Why, that old man, \nthat wretched girL! To think that he would choose \na girl he picked up out of nowhere over his own daughter! \nHe even told me to my face that he'd go right down to \nhis lawyers tomorrow evening to change his inheritance letter\n so that she will own everything. And if not,\n he will throw his money to charities. Charities! \nI am in great distress and will need to clear my head somewhere in the house.\"";
                }
                else {
                    return"Not even Jesus? Christ!\n Hopefully there's nothing important in Alisha's room.";
                }
            }
        }
    }
    private static void missingLetter(String letters1, String letters2, String letters3){
        System.out.println("---Mini Game: Fill in the missing letters---");
        System.out.println("");
        System.out.println("1. in--mie");
        if (letters1.equalsIgnoreCase("do")){
            detectivePoints++;
            System.out.println("Nicely done.");
            System.out.println("");
            System.out.println("In Beatrice's room, there are some white pills, the label says that too much consumption can lead to death within 2 hours,\n some law studies that have been ripped in half, \na half filled cup of chocolate milk gone cold, \nlost of instruments laid around, and a large speaker");
        }
        else {
            System.out.println("Not quite right..");
            System.out.println("");
            System.out.println("Let's see if you know the next one.");
            System.out.println("2. t-unks");
            if (letters2.equalsIgnoreCase("r")){
                detectivePoints++;
                System.out.println("Nicely done.");
                System.out.println("");
                System.out.println("In Beatrice's room, there are some white pills,\n some law studies that have been ripped in half, \na half filled cup of chocolate milk gone cold, \nlost of instruments laid around, and a large speaker");
            }
            else{
                System.out.println("Not quite right..");
                System.out.println("");
                System.out.println("Let's see if you know the next one.");
                System.out.println("3. Cac-i");
                if (letters3.equalsIgnoreCase("t")){
                    detectivePoints++;
                    System.out.println("Nicely done.");
                    System.out.println("");
                    System.out.println("In Beatrice's room, there are some white pills,\n some law studies that have been ripped in half, \na half filled cup of chocolate milk gone cold, \nlost of instruments laid around, and a large speaker");
                }
                else {
                    System.out.println("..you failed the mini game.");
                    System.out.println("");
                    System.out.println("Hopefully there's nothing important in Beatrice's room.");
                }
            }
        }
    }
    private static void flowerName(int flowerguess1, int flowerguess2){
        System.out.println("---Mini Game: Flower names---");
        System.out.println("Guess which name is NOT the name of a flower, you get 2 guesses. \nWrite down the number of the name as your guess. \n \nGood luck!");
        System.out.println("1. Cheeseweed 2. Cuckoo flower 3. Bastard toadflax 4. Thorn Suckle 5. Humped bladderwort");
        if (flowerguess1==4||flowerguess2==4){
            detectivePoints++;
            String quote1 = "The earth laughs in flowers.";
            System.out.println("\""+quote1+"\""+" ― Ralph Waldo Emerson");
            System.out.println("");
            System.out.println("It's good to get to know flowers. Making bud-dies here and there.");
            System.out.println("");
            System.out.println("In Connor's room, you find his a contact in his phone saved as investigator.\n You scrolled through the chats and found out that Connor knows Beatrice had an affair about a month ago. \n You also realize that they are staying in seperate rooms.");
        }
        else {
            String quote2 = "Every flower blooms in its own time";
            System.out.println("\""+quote2+"\""+" ― Ken Petti");
            System.out.println("");
            System.out.println("Hey bud, how's it growing? Hang in there.");
            System.out.println("");
            System.out.println("Hopefully there's nothing important in Connor's room.");
        }
    }
    private static void decimals(double decimals){
        System.out.println("---Mini Game: Decimals---");
        System.out.println("Write down the product of 8.0/5.0 and 5.0/2.5");
        if (decimals==3.2){
            detectivePoints++;
            System.out.println("I guess there is a point in learning math.");
            System.out.println("");
            System.out.println("In Daniel's room, you find a medical kit open and drops of blood on the floor.\nYou finally noticed a dark bruise on Daniel's jaw. \n You also checked his phone and saw he saved Alisha's contact as a heart.");
        }
        else{
            System.out.println("I didn't want to be the one to tell you this but... You're starting to become irrational.");
            System.out.println("");
            System.out.println("Hopefully there's nothing important in Daniel's room");
        }

    }
    //guess the Murderer
    private static boolean guessMurderer(String guess) {
        if (guess.equalsIgnoreCase("Alisha")) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Murder Mystery!");
        String nameDetective = getPlayerName(scanner);
        System.out.println("Very well then, Detective " + nameDetective + ".");

        System.out.println("Type in 'abracadabra' to be transported to the Graham mansion:");
        if (scanner.nextLine().equalsIgnoreCase("abracadabra")) {
            System.out.println("");
            System.out.println("Nice! Transporting you to Graham mansion in 3..2..1..." + "\n \nYou've arrived.");
            System.out.println("");
            System.out.println("It's a Saturday afternoon. George graham died 15 mins earlier at 2pm.\nYou're facing a door. This is the entrance to family head, George Graham's office.");
            System.out.println("");
            System.out.println("Type any alphabet and enter to proceed.");
            System.out.println("");
            scanner.next();
            System.out.println("\n \n");
            System.out.println("A girl with her face streaked in tears comes running up to you. \nShe cries," + " \"Detective " + nameDetective + ", Detective " + nameDetective + ", what was taking you so long?? \nOh, bother! Never mind that. Please, my father has been murdered. \nHelp me figure out who was behind this sinful crime and restore justice to the honourable name of the Grahams!" + "\"");
            System.out.println("\n ");
            scanner.next();
            System.out.println(" \n \n");
            System.out.println("Will you take this case?");
            System.out.println(" \n \n");
            System.out.println("Type yes/no");
            System.out.println("");
            scanner.nextLine();
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("The girl sighs in relief," + "\"Oh goody! My name’s Alisha Graham and I’m the eldest daughter. Right this way." + "\"");
            } else {
                System.out.println("The girl furrows her eyebrows," + "\"That's too bad, since you're already here, might as well come take a look then. \nMy name’s Alisha Graham and I’m the eldest daughter. Right this way." + "\"");
            }
            scanner.next();
            System.out.println("\n \n \n \n");
            System.out.println("You follow Alisha into her father, George Graham's office. \nYou see his body on the floor, seemingly unconscious. You kneel over to check for his pulse and confirms his death.");
            System.out.println("\n \n ");
            scanner.next();
            System.out.println("\n \n \n \n");
            System.out.println("There are three other people in the room. \nBeatrice, the adopted daughter of George Graham. \nConnor is Beatrice's husband. They've been married for one year. \nDaniel is George Graham's assistant.");
            System.out.println("\n ");

            scanner.next();
            System.out.println("\n \n");
            System.out.println("Beatrice said it must've been Connor, he threatened to poison her with her own pills just the night before. \n \nConnor retorted that he wasn't feeling well after coming back from his 2 day trip last night. \nHe claims to have heard Beatrice in a heated argument with her father just this morning. \n \nDaniel stood there, wincing at the chaos unfolding and said nothing.");
            System.out.println("");
            scanner.next();

            System.out.println("\n ");
            System.out.println("-----Investigation In-progress-----");
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Search the crime scene");
            System.out.println("2. Interrogate the suspects");
            System.out.println("3. Check the suspects' timelines");
            System.out.println("\n \n \n ");
            Scanner scanner2 = new Scanner(System.in);
            int choiceInt;
            if (scanner2.hasNextInt()){
                choiceInt = scanner2.nextInt();
            }
            else {
                System.out.println("Invalid! Seems like you're not ready for this case yet.. You've been kicked out of the Mansion.");
                scanner2.close();
                return;
            }
            if (choiceInt == 1) {
                System.out.println("\n \n");
                System.out.println("You found many clues in the crime scene!We have organized it into 3 packs.");
                System.out.println("\nHowever, you must play a mini game for each pack of clues to unlock it.");
                System.out.println("\n \n");
                scanner2.next();
                System.out.println("");
                System.out.println("---Mini Game: Guess the number!---");
                System.out.println("The number is between 0 to 20. It gets hotter when you're closer to the number, and colder when you're not.");
                System.out.println("\n \n");
                int playerAnsCS1 = 0;
                boolean validAnsCS1 = false;
                System.out.println("Enter your answer for the first mini game:");
                if (scanner2.hasNextInt()){
                    playerAnsCS1=scanner2.nextInt();
                    scanner2.nextLine();
                    validAnsCS1=true;
                }
                else{
                    System.out.println("Invalid answer. Please make sure your answer is a number.");
                    scanner2.nextLine();
                }

                System.out.println("---Mini Game: Math!---");
                System.out.println("Solve this problem: 5 * 3 + 2 - 4 / 2 % 3=?");
                int playerAnsCS2 = 0;
                boolean validAnsCS2 = false;
                System.out.println("Enter your answer for the second mini game:");
                if (scanner2.hasNextInt()){
                    playerAnsCS2=scanner2.nextInt();
                    scanner2.nextLine();
                    validAnsCS2=true;
                }
                else{
                    System.out.println("Invalid answer. Please make sure your answer is a number.");
                    scanner2.nextLine();
                }
                if (validAnsCS2){
                    String resultCS2=crimeSceneQ2(playerAnsCS2);
                    System.out.println(resultCS2);
                }

                System.out.println("Enter your first answer for the third mini game:");
                String playerAns1CS3 = scanner2.nextLine();
                System.out.println("Enter your second answer for the third mini game:");
                String playerAns2CS3 = scanner2.nextLine();
                System.out.println("Enter your third answer for the third mini game:");
                String playerAns3CS3 = scanner2.nextLine();
                String resultCS3 = crimeSceneQ3(playerAns1CS3, playerAns2CS3, playerAns3CS3);
                System.out.println(resultCS3);

            } else if (choiceInt == 2) {
                System.out.println("\n \n");
                System.out.println("Who's room would you like to search? \nEnter the name of the person: \n \n \n \n");
                scanner2.nextLine();
                String roomSearchNext = scanner2.next();
                if (roomSearchNext.equalsIgnoreCase("Alisha")) {
                    System.out.println("\n\nYou found 2 clues in the Alisha's room!");
                    System.out.println("\nHowever, you must play a mini game to unlock the clues.");
                    System.out.println("\n\nPress any alphabet and enter to proceed.\n");
                    scanner2.next();
                    System.out.println("\n\nOh dear, seems like you've forgotten your own birthday!");
                    System.out.println("");
                    System.out.println("Looks like there's only one thing left to do: \nSteal someone else's!");
                    System.out.println("\n\nPress any alphabet and enter to proceed\n");
                    scanner2.next();
                    System.out.println("\n\n---Mini Game: Steal a birthday---");
                    System.out.println("");
                    System.out.println("See if you know the birthdays of these people! If you do, then you steal theirs!");
                    System.out.println("\nDon't search them up, you're being watched. \n(Oh right, clues about in Alisha's room will be revealed as a reward for getting it right)\n\n");
                    scanner2.next();
                    System.out.println("1. The Rock Dwayne Johnson");
                    System.out.println("Enter your first answer for 'Steal a birthday':");
                    scanner2.nextLine();
                    String playerAns1Bday = scanner2.nextLine();
                    System.out.println("2. Tony Shu");
                    System.out.println("Enter your second answer for 'Steal a birthday':");
                    scanner2.nextLine();
                    String playerAns2Bday = scanner2.nextLine();
                    System.out.println("");
                    System.out.println("3. Jesus (birth year isn't needed here)");
                    System.out.println("Enter your third answer for 'Steal a birthday':");
                    scanner2.nextLine();
                    String playerAns3Bday = scanner2.nextLine();
                    String resultBday = birthday(playerAns1Bday, playerAns2Bday, playerAns3Bday);
                    System.out.println(resultBday);
                } else if (roomSearchNext.equalsIgnoreCase("Beatrice")) {
                    System.out.println("You found 5 clues in the Beatrice's room!");
                    System.out.println("\nHowever, you must play a mini game to unlock the clues.");
                    String letters1=scanner2.nextLine();
                    String letters2=scanner2.nextLine();
                    String letters3=scanner2.nextLine();
                    missingLetter(letters1, letters2, letters3);
                } else if (roomSearchNext.equalsIgnoreCase("Connor")) {
                    System.out.println("You found 2 clues in Connor's room!");
                    System.out.println("\nHowever, you must play a mini game to unlock the clues.");
                    int flowerGuess1 = scanner2.nextInt();
                    int flowerGuess2 = scanner2.nextInt();
                    scanner2.nextLine();
                    flowerName(flowerGuess1,flowerGuess2);
                } else if (roomSearchNext.equalsIgnoreCase("Daniel")) {
                    System.out.println("You found 2 clues in Daniel's room!");
                    System.out.println("\nHowever, you must play a mini game to unlock the clues.");
                    double decimals = scanner2.nextDouble();
                    scanner2.nextLine();
                    decimals(decimals);
                }
                System.out.println("Invalid! Please check that you've capitalize the first letter of the name.");
            } else if (choiceInt==3) {
                System.out.println("Who's timeline would you like to know more about?");
                String interrogateNext = scanner2.nextLine();
                if (interrogateNext.equalsIgnoreCase("Alisha")) {
                    System.out.println("Alisha's whereabouts from yesterday to today involve 8 significant checkpoints.");
                    System.out.println("\nHowever, you must answer a trivia question to unlock 2 checkpoints at a time.");
                    System.out.println("---Trivia Question 1: ---");
                } else if (interrogateNext.equalsIgnoreCase("Beatrice")) {
                    System.out.println("not done yet");
                } else if (interrogateNext.equalsIgnoreCase("Connor")) {
                    System.out.println("not done yet");
                } else if (interrogateNext.equalsIgnoreCase("Daniel")) {
                    System.out.println("not done yet");
                }
            } else {
                System.out.println("Invalid input. Please enter a number from 1-3.");
                scanner2.close();
                return;
            }
            scanner2.close();
            Scanner scanner3 = new Scanner(System.in);
            if (detectivePoints >= 6) {
                System.out.println("Are you ready to make your guess?");
                if (scanner3.nextLine().charAt(0) == 'Y') {
                    System.out.println("Who is the murderer?");
                    String guess = scanner3.nextLine();
                    guessMurderer(guess);
                } else {
                    System.out.println("No worries, take your time.");
                }
            } else {
                System.out.println("You haven't gathered enough clues. Come back after you've played 10 mini games.");
            }
            scanner3.close();
        }else {
            System.out.println("Unsuccessful! The portal has failed. Start again and check your spelling next time.");
        }

    }

}