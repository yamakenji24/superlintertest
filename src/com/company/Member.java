package com.company;

import java.util.TimeZone;

class Member extends User {
    private static final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000L;
    private Article browsedArticle;    //閲覧済みの有料記事
    private long browseDate = Long.MIN_VALUE;  //記事を閲覧した日付

    Member(String name) {
        super(name);
    }
    boolean testAndMark(Article article) {
        if(article.isFree()) {
            return true;
        }
        long today = today();
        if(browseDate == today) {
            return browsedArticle == article;
        }
        //閲覧済みの有料記事と日付を記録
        browsedArticle = article;
        browseDate = today;
        return true;
    }
    private long today() {
        long time = System.currentTimeMillis();  //現時刻
        TimeZone tz = TimeZone.getDefault();
        time += tz.getOffset(time);
        return time / MILLIS_PER_DAY;
    }
}
