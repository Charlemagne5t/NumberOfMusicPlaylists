import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numMusicPlaylistsTest1() {
        int n = 3;
        int goal = 3;
        int k = 1;
        int expected = 6;
        int actual = new Solution().numMusicPlaylists(n, goal, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numMusicPlaylistsTest2() {
        int n = 2;
        int goal = 3;
        int k = 0;
        int expected = 6;
        int actual = new Solution().numMusicPlaylists(n, goal, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numMusicPlaylistsTest3() {
        int n = 2;
        int goal = 3;
        int k = 1;
        int expected = 2;
        int actual = new Solution().numMusicPlaylists(n, goal, k);

        Assert.assertEquals(expected, actual);
    }
}
