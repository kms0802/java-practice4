package Package.Package_2.a;

public class Hello {
    public void sayPublic() {
        System.out.println("공개 메서드입니다 (public)");
    }

    void sayDefault() {
        System.out.println("기본 접근 메서드입니다 (default)");
    }

    protected void sayProtected() {
        System.out.println("보호된 메서드입니다 (protected)");
    }

    private void sayPrivate() {
        System.out.println("비공개 메서드입니다 (private)");
    }
}
