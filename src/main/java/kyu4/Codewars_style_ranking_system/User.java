package kyu4.Codewars_style_ranking_system;

public class User {

    public User() {
        rank = -8;
        progress = 0;
    }

    public int rank;
    public int progress;

    public void incProgress(int rank){
        isValidRank(rank);

        int rankDiff = calRankDiff(this.rank, rank);
        if (rankDiff > 0) {
            progress(rankDiff * rankDiff * 10);
        } else if (rankDiff == 0) {
            progress(3);
        } else if (rankDiff == -1) {
            progress(1);
        }
    }

    private void isValidRank(int rank) {
        if (rank < -8 || rank > 8 || rank ==0) {
            throw new IllegalArgumentException();
        }
    }

    private int calRankDiff(int userRank, int activityRank) {
        if (userRank * activityRank > 0) {
            return activityRank - userRank;
        }
        if (activityRank > 0) {
            return activityRank - userRank - 1;
        } else {
            return activityRank - userRank + 1;
        }
    }

    private void progress(int progressToAdd) {
        if (isLevel8(this.rank)) {
            fixProgress();
            return;
        }
        this.progress += progressToAdd;
        if (this.progress >= 100) {
            upgrade();
        }
    }

    private void upgrade(){
        int rankToAdd = 0;
        while(this.progress >= 100) {
            this.progress -= 100;
            rankToAdd ++;
        }
        while (rankToAdd > 0) {
            this.rank++;
            if (this.rank == 0) {
                this.rank++;
            }
            rankToAdd--;
        }
        if (isLevel8(this.rank)) {
            fixProgress();
        }
    }

    private boolean isLevel8(int userRank){
        return userRank == 8;
    }

    private void fixProgress() {
        this.rank = 8;
        this.progress =0;
    }
}
