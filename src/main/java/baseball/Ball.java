package baseball;

public class Ball {

	private final int position;
	private final int ballNo;

	public Ball(int position, int ballNo) {
		this.position = position;
		this.ballNo = ballNo;
	}

	public BallStatus play(Ball ball) {
		if(this.equals(ball)) {
			return BallStatus.STRIKE;
		}
		
		
		if(ball.matchBall(ballNo)) {
			return BallStatus.BALL;
		}
		return BallStatus.NOTHING;
	}

	private boolean matchBall(int ballNo) {
		return this.ballNo == ballNo;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Ball ball = (Ball) obj;
		return position == ball.position
				&& ballNo == ball.ballNo;
	}
	
}