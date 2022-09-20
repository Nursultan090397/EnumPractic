public enum Animal {
    DOG("ит"), FROG("бака"), CAT("мышык");
    private String translation;

    Animal(String translation) {

        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Перевод на кыргызский язык " + translation;
    }
}

