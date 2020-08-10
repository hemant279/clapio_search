package com.elad.themovie;

import com.elad.themovie.service.repository.storge.model.Movie;

import java.util.List;

public class HashTag {

    /**
     * status : true
     * message : Hash tag wise video get successfully
     * data : [{"post_id":"133","user_id":"6","full_name":"Manish","user_name":"bunny08","user_profile":"https://platform-lookaside.fbsbx.com/platform/profilepic/?asid=2928554603934556&height=200&width=200&ext=1598877935&hash=AeRq5XP1FGBFfhdy","is_verify":"0","is_trending":"0","post_description":"#akm #fun","post_hash_tag":"#akm #fun","post_video":"9f488e2853acaf8cb7f4b75f59eb9c9foutput-filtered.mp4","post_image":"8116d82570e5e1c987068957fd9abd71Test","sound_id":null,"sound_title":null,"duration":null,"singer":null,"sound_image":null,"sound":null,"post_likes_count":"22","post_comments_count":0,"post_view_count":"209","status":"1","created_date":"17-07-20 35:31:am","video_likes_or_not":0,"is_follow":"0"},{"post_id":"187","user_id":"149","full_name":"Navi Kaur","user_name":"Navi","user_profile":"e4b91ecb5d0a7068fd95d329cd03ac5bIMG_20200710_183149268.jpg","is_verify":"0","is_trending":"0","post_description":"#funny","post_hash_tag":"#funny","post_video":"07e83b312ea75180c788ce9877ac02f8navikour11_1594378491_musicallydowncom.mp4","post_image":"c62e5abe33ebc69f923f591e8ed851acthumb_1594445398437.png","sound_id":null,"sound_title":null,"duration":null,"singer":null,"sound_image":null,"sound":null,"post_likes_count":"15","post_comments_count":0,"post_view_count":"143","status":"1","created_date":"17-07-20 35:31:am","video_likes_or_not":0,"is_follow":"0"},{"post_id":"609","user_id":"1004","full_name":"Dhiraj Gaur","user_name":"Dhiraj786","user_profile":"","is_verify":"0","is_trending":"0","post_description":"best comedy#foryou#comedy#funny#fyp","post_hash_tag":"foryou,comedy,funny,fyp","post_video":"RoposoVideo48417211-1f8d-4e24-a38d-2dfce06b3e53.mp4","post_image":"thumb_1595969816465.png","sound_id":"772","sound_title":"Original sound by Dhiraj Gaur","duration":"00:00:14","singer":"Dhiraj786","sound_image":"3137thumb_1595969816465.png","sound":"3341audio_1595969898099.aac","post_likes_count":"14","post_comments_count":1,"post_view_count":"124","status":"1","created_date":"2020-07-28 20:58:34","video_likes_or_not":0,"is_follow":"0"},{"post_id":"606","user_id":"1004","full_name":"Dhiraj Gaur","user_name":"Dhiraj786","user_profile":"","is_verify":"0","is_trending":"0","post_description":"kyu Sahi baat he na ","post_hash_tag":"foryou,comedy,act,fyp,funny,dhiraj123","post_video":"5201807567450073006_play.mp4_logo_GB.mp4","post_image":"thumb_1595968956458.png","sound_id":"769","sound_title":"Original sound by Dhiraj Gaur","duration":"00:00:13","singer":"Dhiraj786","sound_image":"6917thumb_1595968956458.png","sound":"8261audio_1595969037562.aac","post_likes_count":"9","post_comments_count":0,"post_view_count":"121","status":"1","created_date":"2020-07-28 20:44:07","video_likes_or_not":0,"is_follow":"0"},{"post_id":"3661","user_id":"8884","full_name":"Kamal jabiya","user_name":"visku934","user_profile":"IMG_20200808_131547351.jpg","is_verify":"0","is_trending":"0","post_description":"ब्याह और नया मोबाईल #funny #kamaljabiya ","post_hash_tag":"funny,kamaljabiya","post_video":"1596895618346merged.mp4","post_image":"1596895565396_thumb.png","sound_id":"3692","sound_title":"Original sound by Kamal jabiya","duration":"00:00:19","singer":"visku934","sound_image":"72091596895565396_thumb.png","sound":"15781596895618373audio.aac","post_likes_count":"9","post_comments_count":0,"post_view_count":"46","status":"1","created_date":"2020-08-08 19:37:40","video_likes_or_not":0,"is_follow":"0"},{"post_id":"3452","user_id":"8884","full_name":"Kamal jabiya","user_name":"visku934","user_profile":"IMG_20200808_131547351.jpg","is_verify":"0","is_trending":"0","post_description":"आई लव यू ","post_hash_tag":"Funny,kamaljabiya","post_video":"1596877312902merged.mp4","post_image":"1596877276653_thumb.png","sound_id":"3509","sound_title":"Original sound by Kamal jabiya","duration":"00:00:21","singer":"visku934","sound_image":"25281596877276653_thumb.png","sound":"77071596877312969audio.aac","post_likes_count":"8","post_comments_count":0,"post_view_count":"44","status":"1","created_date":"2020-08-08 14:38:00","video_likes_or_not":0,"is_follow":"0"},{"post_id":"2357","user_id":"4500","full_name":"Nehabasu46","user_name":"nehabasu46","user_profile":"IMG_20200804_124914070.jpg","is_verify":"0","is_trending":"0","post_description":"  plz guys like nfollow me #foryoupage #funnydailogue #nehabasu46","post_hash_tag":"foryoupage,funnydailogue,nehabasu46","post_video":"1596598015062merged.mp4","post_image":"1596597967946_thumb.png","sound_id":"2446","sound_title":"Original sound by Nehabasu46","duration":"00:00:14","singer":"nehabasu46","sound_image":"77001596597967946_thumb.png","sound":"9801596598015136audio.aac","post_likes_count":"8","post_comments_count":1,"post_view_count":"90","status":"1","created_date":"2020-08-05 03:29:08","video_likes_or_not":0,"is_follow":"0"},{"post_id":"4352","user_id":"10649","full_name":"Sachin Kushwah","user_name":"sachinkushwah","user_profile":"IMG_20200809_124911055.jpg","is_verify":"0","is_trending":"0","post_description":"\n\u2022\n\u2022\n\u2022\n","post_hash_tag":"guys,guy,boy,toptags,boys,love,me,cute,handsome,picoftheday,photooftheday,instagood,fun,smile,dude,follow,followme,swag,hot,cool,kik,igers,ins","post_video":"1596956475449merged.mp4","post_image":"1596956452080_thumb.png","sound_id":"4345","sound_title":"Original sound by Sachin Kushwah","duration":"00:00:17","singer":"129134535547067","sound_image":"14661596956452080_thumb.png","sound":"29351596956475550audio.aac","post_likes_count":"8","post_comments_count":1,"post_view_count":"41","status":"1","created_date":"2020-08-09 12:31:56","video_likes_or_not":0,"is_follow":"0"},{"post_id":"3872","user_id":"3769","full_name":"sumitkumarsinha","user_name":"SUMITSINHA14","user_profile":"IMG_20200810_075701028.jpg","is_verify":"0","is_trending":"0","post_description":"","post_hash_tag":"sumitkumarsinha,treanding,funny","post_video":"1596936502907merged.mp4","post_image":"1596936458013_thumb.png","sound_id":"3895","sound_title":"Original sound by sumitkumarsinha","duration":"00:00:13","singer":"SUMITSINHA14","sound_image":"96681596936458013_thumb.png","sound":"26031596936503431audio.aac","post_likes_count":"6","post_comments_count":0,"post_view_count":"42","status":"1","created_date":"2020-08-09 06:58:44","video_likes_or_not":0,"is_follow":"0"},{"post_id":"4431","user_id":"10649","full_name":"Sachin Kushwah","user_name":"sachinkushwah","user_profile":"IMG_20200809_124911055.jpg","is_verify":"0","is_trending":"0","post_description":"\n\u2022\n\u2022\n\u2022\n","post_hash_tag":"funny,toptags,joke,epic,lol,crazy,fun,instafun,witty,tweegram,humor,cash,jokes,wacky,hilarious,photooftheday,laughing,joking,friends,instagood,l","post_video":"1596959031553merged.mp4","post_image":"1596959024305_thumb.png","sound_id":"4417","sound_title":"Original sound by Sachin Kushwah","duration":"00:00:08","singer":"sachinkushwah","sound_image":"47381596959024305_thumb.png","sound":"911596959031878audio.aac","post_likes_count":"6","post_comments_count":0,"post_view_count":"41","status":"1","created_date":"2020-08-09 13:14:09","video_likes_or_not":0,"is_follow":"0"}]
     * post_count : 28
     * page : 3
     */

    private boolean status;
    private String message;
    private int post_count;
    private int page;
    private List<Movie> data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPost_count() {
        return post_count;
    }

    public void setPost_count(int post_count) {
        this.post_count = post_count;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Movie> getData() {
        return data;
    }

    public void setData(List<Movie> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * post_id : 133
         * user_id : 6
         * full_name : Manish
         * user_name : bunny08
         * user_profile : https://platform-lookaside.fbsbx.com/platform/profilepic/?asid=2928554603934556&height=200&width=200&ext=1598877935&hash=AeRq5XP1FGBFfhdy
         * is_verify : 0
         * is_trending : 0
         * post_description : #akm #fun
         * post_hash_tag : #akm #fun
         * post_video : 9f488e2853acaf8cb7f4b75f59eb9c9foutput-filtered.mp4
         * post_image : 8116d82570e5e1c987068957fd9abd71Test
         * sound_id : null
         * sound_title : null
         * duration : null
         * singer : null
         * sound_image : null
         * sound : null
         * post_likes_count : 22
         * post_comments_count : 0
         * post_view_count : 209
         * status : 1
         * created_date : 17-07-20 35:31:am
         * video_likes_or_not : 0
         * is_follow : 0
         */

        private String post_id;
        private String user_id;
        private String full_name;
        private String user_name;
        private String user_profile;
        private String is_verify;
        private String is_trending;
        private String post_description;
        private String post_hash_tag;
        private String post_video;
        private String post_image;
        private Object sound_id;
        private Object sound_title;
        private Object duration;
        private Object singer;
        private Object sound_image;
        private Object sound;
        private String post_likes_count;
        private int post_comments_count;
        private String post_view_count;
        private String status;
        private String created_date;
        private int video_likes_or_not;
        private String is_follow;

        public String getPost_id() {
            return post_id;
        }

        public void setPost_id(String post_id) {
            this.post_id = post_id;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getUser_profile() {
            return user_profile;
        }

        public void setUser_profile(String user_profile) {
            this.user_profile = user_profile;
        }

        public String getIs_verify() {
            return is_verify;
        }

        public void setIs_verify(String is_verify) {
            this.is_verify = is_verify;
        }

        public String getIs_trending() {
            return is_trending;
        }

        public void setIs_trending(String is_trending) {
            this.is_trending = is_trending;
        }

        public String getPost_description() {
            return post_description;
        }

        public void setPost_description(String post_description) {
            this.post_description = post_description;
        }

        public String getPost_hash_tag() {
            return post_hash_tag;
        }

        public void setPost_hash_tag(String post_hash_tag) {
            this.post_hash_tag = post_hash_tag;
        }

        public String getPost_video() {
            return post_video;
        }

        public void setPost_video(String post_video) {
            this.post_video = post_video;
        }

        public String getPost_image() {
            return post_image;
        }

        public void setPost_image(String post_image) {
            this.post_image = post_image;
        }

        public Object getSound_id() {
            return sound_id;
        }

        public void setSound_id(Object sound_id) {
            this.sound_id = sound_id;
        }

        public Object getSound_title() {
            return sound_title;
        }

        public void setSound_title(Object sound_title) {
            this.sound_title = sound_title;
        }

        public Object getDuration() {
            return duration;
        }

        public void setDuration(Object duration) {
            this.duration = duration;
        }

        public Object getSinger() {
            return singer;
        }

        public void setSinger(Object singer) {
            this.singer = singer;
        }

        public Object getSound_image() {
            return sound_image;
        }

        public void setSound_image(Object sound_image) {
            this.sound_image = sound_image;
        }

        public Object getSound() {
            return sound;
        }

        public void setSound(Object sound) {
            this.sound = sound;
        }

        public String getPost_likes_count() {
            return post_likes_count;
        }

        public void setPost_likes_count(String post_likes_count) {
            this.post_likes_count = post_likes_count;
        }

        public int getPost_comments_count() {
            return post_comments_count;
        }

        public void setPost_comments_count(int post_comments_count) {
            this.post_comments_count = post_comments_count;
        }

        public String getPost_view_count() {
            return post_view_count;
        }

        public void setPost_view_count(String post_view_count) {
            this.post_view_count = post_view_count;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCreated_date() {
            return created_date;
        }

        public void setCreated_date(String created_date) {
            this.created_date = created_date;
        }

        public int getVideo_likes_or_not() {
            return video_likes_or_not;
        }

        public void setVideo_likes_or_not(int video_likes_or_not) {
            this.video_likes_or_not = video_likes_or_not;
        }

        public String getIs_follow() {
            return is_follow;
        }

        public void setIs_follow(String is_follow) {
            this.is_follow = is_follow;
        }
    }
}
