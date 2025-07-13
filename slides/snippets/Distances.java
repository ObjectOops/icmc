public class Distances {
    public static void main(String[] args) {
        int r_to_a = 65;
        int r_to_u = 55;
        int a_to_u = 40;
        int u_to_a = 40;
        int a_to_g = 180;
        int u_to_g = 180;

        int path_1 = r_to_a + a_to_g;
        int path_2 = r_to_u + u_to_g;
        int path_3 = r_to_a + a_to_u + u_to_g;
        int path_4 = r_to_u + u_to_a + a_to_g;
        
        boolean path_1_valid = isPathValid(path_1, path_2, path_3, path_4);
        boolean path_2_valid = isPathValid(path_2, path_1, path_3, path_4);
        boolean path_3_valid = isPathValid(path_3, path_1, path_2, path_4);
        boolean path_4_valid = isPathValid(path_4, path_1, path_2, path_3);

        System.out.println("Rotterdam --> Amsterdam --> Groningen: " + path_1_valid);
        System.out.println("Rotterdam --> Utrecht --> Groningen: " + path_2_valid);
        System.out.println("Rotterdam --> Amsterdam --> Utrecht --> Groningen: " + path_3_valid);
        System.out.println("Rotterdam --> Utrecht --> Amsterdam --> Groningen: " + path_4_valid);
    }
    
    public static boolean isPathValid(int main_path, int other_path_a, int other_path_b, int other_path_c) {
        // This is the main boolean expression that return `true` if the path meets Dijkstra's criteria.
        return (
            (main_path <= other_path_a && main_path <= other_path_b && main_path <= other_path_c)
            || (main_path % 7 != 0 && main_path % 11 != 0)
        );
        // There can be multiple ways to write a boolean expression:
        // return (
        //     !(main_path > other_path_a || main_path > other_path_b || main_path > other_path_c)
        //     && !(main_path % 7 == 0 || main_path % 11 == 0)
        // );
    }
}
