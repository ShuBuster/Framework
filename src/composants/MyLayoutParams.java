package composants;

import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;

/**
 * Classe permettant de simplifier la creation les layout params
 * @author Nicklos
 *
 */
public class MyLayoutParams extends RelativeLayout.LayoutParams{

	public MyLayoutParams() {
		super(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
	}
	
	public MyLayoutParams toLeftOf(View v){
		this.addRule(RelativeLayout.START_OF,v.getId());
		return this;
	}
	
	public MyLayoutParams toRightOf(View v){
		this.addRule(RelativeLayout.RIGHT_OF,v.getId());
		return this;
	}
	
	public MyLayoutParams below(View v){
		this.addRule(RelativeLayout.BELOW,v.getId());
		return this;
	}
	
	public MyLayoutParams above(View v){
		this.addRule(RelativeLayout.ABOVE,v.getId());
		return this;
	}
	
	public MyLayoutParams centerHorizontal(){
		this.addRule(RelativeLayout.CENTER_HORIZONTAL);
		return this;
	}
	
	public MyLayoutParams marginTop(int margin){
		this.topMargin = margin;
		return this;
	}
	
	public MyLayoutParams marginBottom(int margin){
		this.bottomMargin = margin;
		return this;
	}
	
	public MyLayoutParams marginLeft(int margin){
		this.leftMargin = margin;
		return this;
	}
	
	public MyLayoutParams marginRight(int margin){
		this.rightMargin = margin;
		return this;
	}

}