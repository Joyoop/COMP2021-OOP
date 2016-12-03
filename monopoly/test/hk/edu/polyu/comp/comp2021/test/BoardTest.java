package hk.edu.polyu.comp.comp2021.test;

import hk.edu.polyu.comp.comp2021.monopoly.Board;
import hk.edu.polyu.comp.comp2021.monopoly.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Surface on 2016/12/2.
 */
public class BoardTest {
    Board board;
    @Before
    public void setUp() throws Exception {
        int totalPlayer = 5;
        int[] AI = {1,2};
        board = new Board(totalPlayer, AI);
    }

    @Test
    public void movePlayer() throws Exception {
        Player[] players1 = board.getPlayers();
        players1[1].setPosition(2);
        board.movePlayer(players1[1], 1);
        int currentPosition = players1[1].getCurrentPosition();
        assertEquals(3, currentPosition);
        players1[1].setPosition(13);
        board.movePlayer(players1[1], 2);
        int currentPosition1 = players1[1].getCurrentPosition();
        assertEquals(5, currentPosition1);
    }

    @Test
    public void movePlayer1() throws Exception {
        Player[] players1 = board.getPlayers();
        players1[1].setPosition(2);
        board.movePlayer(players1[1], 1,true);
        int currentPosition = players1[1].getCurrentPosition();
        assertEquals(3, currentPosition);
    }

    @Test
    public void hasWinner() throws Exception {
        Player[] players1 = board.getPlayers();
        for(int i = 0; i < 4;i++){
            players1[i].setBrokeOut(true, board);
        }
        players1[4].setBrokeOut(false, board);
        boolean test = board.hasWinner();
        assertEquals(true, test);
        for(int i = 0; i < 3;i++){
            players1[i].setBrokeOut(true, board);
        }
        players1[3].setBrokeOut(false, board);
        players1[4].setBrokeOut(false, board);
        boolean test1 = board.hasWinner();
        assertEquals(false, test1);
    }

    @Test
    public void getWinner() throws Exception {
        Player[] players1 = board.getPlayers();
        for(int i = 0; i < 4;i++){
            players1[i].setBrokeOut(true, board);
        }
        players1[4].setBrokeOut(false, board);
        int test = board.getWinner().getID();
        assertEquals(4, test);
        for(int i = 0; i < 3;i++){
            players1[i].setBrokeOut(true, board);
        }
        players1[3].setBrokeOut(false, board);
        players1[4].setBrokeOut(false, board);
        Player test1 = board.getWinner();
        assertEquals(null, test1);
    }

    @Test
    public void getMaxMoneyPlayer() throws Exception {

    }

    @Test
    public void normalizePosition() throws Exception {

    }

    @Test
    public void getCurrentPlayer() throws Exception {

    }

    @Test
    public void getPlayers() throws Exception {

    }

    @Test
    public void getReport() throws Exception {

    }

    @Test
    public void nextTurn() throws Exception {

    }

    @Test
    public void getPlayer() throws Exception {

    }

    @Test
    public void getTotalSquare() throws Exception {

    }

}