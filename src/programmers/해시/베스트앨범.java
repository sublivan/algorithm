package programmers.해시;

import java.util.*;

public class 베스트앨범 {

    class Music implements Comparable<Music> {
        int id;
        int played;
        String genre;

        public Music(int id, int played, String genre) {
            this.id = id;
            this.played = played;
            this.genre = genre;
        }

        @Override
        public int compareTo(Music s) {
            if (this.played == s.played) { // 플레이수가 같으면 고유번호가 작은순
                return this.id - s.id;
            }
            return -(this.played - s.played); // 내림차순 (플레이수가 많은 순서)
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        List<Music> musicList = new ArrayList<>();
        Map<String, Integer> genreMap;
        List<Integer> bestAlbum;

        for (int i = 0; i < genres.length; i++) {
            musicList.add(new Music(i, plays[i], genres[i]));
        }
        genreMap = makeGenreMap(genres, plays);

        Collections.sort(musicList, new Comparator<Music>() {
            @Override
            public int compare(Music m1, Music m2) {
                if (m1.genre.equals(m2.genre)) { // 장르가 같을때
                    return m1.compareTo(m2);
                }
                return -(genreMap.get(m1.genre) - genreMap.get(m2.genre)); // 장르가 다를때
            }
        });

        bestAlbum = makeBestAlbum(musicList);

        int[] answer = new int[bestAlbum.size()];
        for (int i = 0; i < bestAlbum.size(); i++) {
            answer[i] = bestAlbum.get(i);
        }
        return answer;
    }

    public List<Integer> makeBestAlbum(List<Music> musicList) {
        List<Integer> bestAlbum = new ArrayList<>();
        Map<String, Integer> albumCntMap = new HashMap<>();

        for (Music music : musicList) {
            if (!albumCntMap.containsKey(music.genre)) {
                bestAlbum.add(music.id);
                albumCntMap.put(music.genre, 1);
            } else {
                if (albumCntMap.get(music.genre) < 2) {
                    bestAlbum.add(music.id);
                    albumCntMap.put(music.genre, albumCntMap.get(music.genre) + 1);
                }
            }
        }
        return  bestAlbum;
    }

    public Map<String, Integer> makeGenreMap(String[] genres, int[] plays) {
        Map<String, Integer> genreMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (genreMap.containsKey(genres[i])) {
                genreMap.put(genres[i], genreMap.get(genres[i]) + plays[i]);
            } else {
                genreMap.put(genres[i], plays[i]);
            }
        }
        return genreMap;
    }
}

/*
먼저 수록

1. 속한 노래가 많이 재생된 장르
2. 장르 내에서 많이 재생된 노래
3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유번호가 낮은 노래

i : 고유번호
genres[i] : 고유번호 i의 노래 장르
plays[i] : 고유번호 i의 재생된 횟수

 */