package entity;

public class Post_manage_license {
    private String license_code;

    public Post_manage_license(){}

    public Post_manage_license(String license_code) {
        this.license_code = license_code;
    }

    public String getLicense_code() {
        return license_code;
    }

    public void setLicense_code(String license_code) {
        this.license_code = license_code;
    }

    @Override
    public String toString() {
        return "Post_manage_license{" +
                "license_code='" + license_code + '\'' +
                '}';
    }
}
