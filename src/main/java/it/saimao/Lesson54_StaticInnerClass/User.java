package it.saimao.Lesson54_StaticInnerClass;

public class User {
    private String name;
    // Prohibit creating object using new keyword
    private User() { }
    public static class UserBuilder {
        private String name;
        // Return UserBuilder to enable chaining
        public UserBuilder setName(String name) {
            this.setName(name);
            return this;
        }
        public User build() {
            User user = new User();
            user.name = this.name;
            return user;
        }
    }
}
