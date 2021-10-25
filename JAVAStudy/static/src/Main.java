public class Main {
    public static void main(String[] args){

        //static = modifier. A single copy of a variable/method is created and shared
        // The class "owns" the static member

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("patrick");
        Friend friend3 = new Friend("squidward");

        // when you access static value, use class type instead of instance
        System.out.println(friend1.numberOfFriends);

        // when you use static method, use class type instead of instance
        friend1.displayFriends();
    }
}
