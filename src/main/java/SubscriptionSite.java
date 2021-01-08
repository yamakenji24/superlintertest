package main.java;

public class SubscriptionSite {
    public static void main(String[] args) {
        AccountFactory factory = new AccountFactory();
        User[] readers = {
                factory.createGuest(),
                factory.createMember(),
                factory.createPaidMember()
        };

        Article.create("0001", "PC入門", "PC初心者・・・", false)
        Article.create("0002", "スマホ特集", "最新のスマホ・・・", false);
        Article.create("0003", "アプリガイド", "使えるアプリ・・・", true);

        for( User reader: readers ) {
            for( String id: Article.getIds() ) {
                Article article = Article.getArticle(id);
                String body;
                if(reader.testAndMark(article)) {
                    body = article.getBody();
                } else {
                    body = "<閲覧不可>";
                }
                System.out.printf("%s: 記事「%s」 %s%n",
                        reader.getName(), article.getHeadline(), body);
            }
        }
    }
}
