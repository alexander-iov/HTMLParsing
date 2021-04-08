public class Article {

    private String name;
    private double cost;
    private String url;
    private String about;

    public Article(String name, double cost, String url, String about) {
        this.name = name;
        this.cost = cost;
        this.url = url;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", url='" + url + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
