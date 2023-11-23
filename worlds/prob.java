package worlds;


/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class prob extends GraphicsProgram {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** Number of turns */
	private static final int NTURNS = 3;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	double brickY = BRICK_Y_OFFSET;
	GRect brick;
	GRect paddle;
	int paddleY;
	GOval ball;
	private double vx, vy;
	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
		gameInit();
		addMouseListeners();
		pause(20);
		gameProcess();
	}

	private void gameProcess() {
		ballStartMovement();
		ballMovement();
	}
private void ballMovement() {
		
		
	}

private void ballStartMovement() {
		vy = 3.0;
		vx = rgen.nextDouble(1.0, 10.0);
		if (rgen.nextBoolean(0.5)) vx = -vx;
		while((ball.getX() < getWidth() - 2* BALL_RADIUS) && (ball.getX() > 0) && (ball.getY() > 0) && (ball.getY() < getHeight() - 2* BALL_RADIUS) ){
			ball.move(vx, vy);
			GObject collider = getElementAt(ball.getX(), ball.getY());
			if((ball.getX() >= getWidth()- 2* BALL_RADIUS) || ((ball.getX() <= 0))){
				vx = -vx;
				ball.move(vx, vy);
			}
			if((ball.getY() <= 0) || (ball.getY() >= getHeight() - 2* BALL_RADIUS)){
				vy = -vy;
				ball.move(vx,  vy);
			}
			if(collider == paddle){
				vy = -vy;
				ball.move(vx, vy);
			}
			if(collider != paddle){
				vy = -vy;
				remove(collider);
				ball.move(vx, vy);
			}
			pause(20);
		}
		
	}
private GObject getCollidingObject(){
	if(getElementAt(ball.getX(), ball.getY()) != null){
		return getElementAt(ball.getX(), ball.getY());
	}
	if(getElementAt(ball.getX()+ 2*BALL_RADIUS, ball.getY()) != null){
		return getElementAt(ball.getX() + 2* BALL_RADIUS, ball.getY());
	}
	if(getElementAt(ball.getX(), ball.getY() + 2 * BALL_RADIUS) != null){
		return getElementAt(ball.getX(), ball.getY()+ 2 * BALL_RADIUS);
	}
	if(getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY()+ 2* BALL_RADIUS) != null){
		return getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY() + 2 * BALL_RADIUS);
	}
	return null;
}

	//	paddleMovement
	public void mouseMoved (MouseEvent e){
		int x = e.getX();
		if(x < getWidth()- PADDLE_WIDTH){
			paddle.setLocation(x, paddleY);
		}
	}

	private void gameInit() {
		arrangeBricks();
		createPaddle();
		createBall();
	}

	private void createBall() {
		ball = new GOval(2 * BALL_RADIUS,2 * BALL_RADIUS);
		double ballX = (getWidth() - 2* BALL_RADIUS)/2;
		double ballY = (getHeight()- 2* BALL_RADIUS)/2;
		add(ball, ballX,ballY);
		
	}

	private void createPaddle() {
		paddleY = getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT;
		paddle = new GRect (PADDLE_WIDTH, PADDLE_HEIGHT);
		add(paddle, 0, paddleY);
	}

	private void arrangeBricks() {
		for(int j = 0; j < NBRICK_ROWS; j++){
			fillLine(colorGuesser(j));
			brickY = brickY + BRICK_HEIGHT + BRICK_SEP;
		}
	}

	private Color colorGuesser(int n) {
		if(n % 10 < 2){
			return Color.RED;
		}
		if(n % 10 < 4 ){
			return Color.ORANGE;
		}
		if(n % 10 < 6){
			return Color.YELLOW;
		}
		if(n % 10 < 8 ){
			return Color.GREEN;
		}
		if(n % 10 < 10){
			return Color.CYAN;
		}
		return null;
		
	}

	private void fillLine(Color n) {
		double x = (getWidth() - (NBRICKS_PER_ROW * BRICK_WIDTH) - ((NBRICKS_PER_ROW-1) * BRICK_SEP)) / 2;
		for(int i = 0; i < NBRICKS_PER_ROW; i++){
			brick = new GRect (BRICK_WIDTH, BRICK_HEIGHT);
			add(brick, x, brickY);
			x = x + BRICK_WIDTH + BRICK_SEP;
			brick.setFilled(true);
			brick.setColor(n);
		}

	}

}
