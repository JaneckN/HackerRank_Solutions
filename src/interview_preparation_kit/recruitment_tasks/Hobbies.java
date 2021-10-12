package interview_preparation_kit.recruitment_tasks;

import java.util.*;

/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 10 October 2021 @ 20:44
 */


public class Hobbies {

    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findAllHobbyists(String hobby) {
        List<String> hobbyistsWhoMatchHobby = new ArrayList<>();
        Set<String> set = hobbies.keySet();

        for (String person : set) {
            String[] userHobbies = hobbies.get(person);
            boolean contains = Arrays.asList(userHobbies).contains(hobby);
            if (contains) {
                hobbyistsWhoMatchHobby.add(person);
            }

        }
        return hobbyistsWhoMatchHobby;
    }

    public static void main(String[] args) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("Steve", "Fashion", "Piano", "Reading");
        hobbies.add("Patty", "Drama", "Magic", "Pets", "Yoga");
        hobbies.add("Chad", "Puzzles", "Pets", "Yoga");

        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));
    }
}