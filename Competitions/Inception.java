package Competitions;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inception {
    public static void main(String[] args) {
        HashMap<String, Integer> actors = new HashMap<>();
        actors.put("Dom", 0);
        actors.put("Robert", 0);
        actors.put("Eames", 0);
        actors.put("Ariadne", 0);
        actors.put("Mal", 0);
        actors.put("Saito", 0);

        HashMap<Integer, String> depthLeaders = new HashMap<>();

        // To find the worst dreamer
        HashMap<String, Integer> killCount = new HashMap<>();
        killCount.put("Dom", 0);
        killCount.put("Robert", 0);
        killCount.put("Eames", 0);
        killCount.put("Ariadne", 0);
        killCount.put("Mal", 0);
        killCount.put("Saito", 0);

        File instructions = new File("Competitions/challenge.txt");
        try (Scanner input = new Scanner(instructions)) {
            while (input.hasNextLine()) {
                String command = input.nextLine();
                String instruction = command.split(" ")[0];
                String name = command.split(" ")[1];

                if (instruction.equals("DREAM")) {
                    if (actors.get(name) != -1) {
                        if (!depthLeaders.containsKey(actors.get(name) + 1)) {
                            depthLeaders.put(actors.get(name) + 1, name);
                        }
                        actors.put(name, actors.get(name) + 1);
                    }
                } else if (instruction.equals("WAKE") && actors.get(name) > 0) {
                    if (actors.get(name) != -1) {
                        if (depthLeaders.containsValue(name)) {
                            for(Map.Entry<String, Integer> entry : actors.entrySet()) {
                                String loopActor = entry.getKey();
                                Integer loopDepth = entry.getValue();
                                if (!loopActor.equals(name)) {
                                    if (loopDepth >= actors.get(name)) {
                                        actors.replace(loopActor, -1);
                                        killCount.replace(name, killCount.get(name) + 1);
                                    }
                                }
                            }
                            depthLeaders.remove(actors.get(name));
                        }
                        if (actors.get(name) > 0) actors.put(name, actors.get(name) - 1);
                    }
                }
            }
            System.out.println("actors " + actors);
            System.out.println("killCount " + killCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }    
}
