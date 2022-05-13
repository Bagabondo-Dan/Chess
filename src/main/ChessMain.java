package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ChessMain {
    public static void main(String[] args) {

        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();


        for (Player player : players) {
            System.out.println(player);
        }

       HashMap<String, Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap.entrySet());
        for (Map.Entry<String,Piece> entry : pieceHashMap.entrySet()) {
            System.out.println(entry);

        }


    }

    public ArrayList<Player> createPlayers() {
        Player blackPlayer = new Player("Гарри Каспаров", "garry_kasp@gmail.com", 2100, 55, true);
        Player whitePlayer = new Player("Карл Магнус", "maga_777@gmail.com", 2800, 26, false);
        ArrayList<Player> players = new ArrayList();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;

    }

    public  HashMap<String, Piece> createPieces() {
        King whiteKing = new King(new Spot("H", 7), "White_king", true, false);
        System.out.println(whiteKing);
        King blackKing = new King(new Spot("D", 8), "Black_king", false, false);
        System.out.println(blackKing);
        Knight blackKnight = new Knight(new Spot("D", 6), "Black_knight", false, false);
        System.out.println(blackKnight);
        Roor whiteRoor1 = new Roor(new Spot("A", 7), "White_roor_1", true, false);
        System.out.println(whiteRoor1);
        Roor whiteRoor2 = new Roor(new Spot("G", 7), "White_roor_2", true, false);
        System.out.println(whiteRoor2);

        HashMap<String, Piece> pieceHashMap = new HashMap<>() ;
        pieceHashMap.put(whiteKing.getId(), whiteKing) ;
        pieceHashMap.put(whiteRoor1.getId(), whiteRoor1) ;
        pieceHashMap.put(whiteRoor2.getId(), whiteRoor2) ;
        pieceHashMap.put(blackKing.getId(), blackKing) ;
        pieceHashMap.put(blackKnight .getId(), blackKnight) ;
        return pieceHashMap;


    }

    public void play(ArrayList<Player> players, HashMap<String,Piece> pieceHashMap) {
        //move 1
        players.get(0).movePiece(pieceHashMap.get("White_roor_1"), new Spot("A",8));
        players.get(1).movePiece(pieceHashMap.get("Black_knight"), new Spot("C",8));

    }



}
