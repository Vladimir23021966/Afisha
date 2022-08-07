public class ManagerFilms {
    protected String[] films = new String[0];
    protected int limit;


    public ManagerFilms() {
        this.limit = 10;

    }

    public ManagerFilms(int limit) {

        this.limit = limit;
    }


    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length] = film;
        films = tmp;
    }

    public String[] findAll() {

        return films;
    }

    public String[] findLast() {
        int resultLength = Math.min(films.length, limit);
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;

    }


}

