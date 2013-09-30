package Design;

import MainView;



public class MainController {

	/**
	 * @uml.property  name="_mainView"
	 */
	private MainView _mainView;

	/**
	 * Getter of the property <tt>_mainView</tt>
	 * @return  Returns the _mainView.
	 * @uml.property  name="_mainView"
	 */
	public MainView get_mainView() {
		return _mainView;
	}

	/**
	 * Setter of the property <tt>_mainView</tt>
	 * @param _mainView  The _mainView to set.
	 * @uml.property  name="_mainView"
	 */
	public void set_mainView(MainView _mainView) {
		this._mainView = _mainView;
	}

	/**
	 * @uml.property  name="mainView"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="mainController:Design.MainView"
	 */
	private Design.MainView mainView = new Design.MainView();

	/**
	 * Getter of the property <tt>mainView</tt>
	 * @return  Returns the mainView.
	 * @uml.property  name="mainView"
	 */
	public Design.MainView getMainView() {
		return mainView;
	}

	/**
	 * Setter of the property <tt>mainView</tt>
	 * @param mainView  The mainView to set.
	 * @uml.property  name="mainView"
	 */
	public void setMainView(Design.MainView mainView) {
		this.mainView = mainView;
	}

	/**
	 * @uml.property  name="mainView1"
	 * @uml.associationEnd  multiplicity="(1 1)" aggregation="composite" inverse="mainController1:Design.MainView"
	 */
	private Design.MainView mainView1 = new Design.MainView();

	/**
	 * Getter of the property <tt>mainView1</tt>
	 * @return  Returns the mainView1.
	 * @uml.property  name="mainView1"
	 */
	public Design.MainView getMainView1() {
		return mainView1;
	}

	/**
	 * Setter of the property <tt>mainView1</tt>
	 * @param mainView1  The mainView1 to set.
	 * @uml.property  name="mainView1"
	 */
	public void setMainView1(Design.MainView mainView1) {
		this.mainView1 = mainView1;
	}

	/** 
	 * @uml.property name="mainView2"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="mainController2:Design.MainView"
	 */
	private Design.MainView mainView2 = new Design.MainView();

	/** 
	 * Getter of the property <tt>mainView2</tt>
	 * @return  Returns the mainView2.
	 * @uml.property  name="mainView2"
	 */
	public Design.MainView getMainView2() {
		return mainView2;
	}

	/** 
	 * Setter of the property <tt>mainView2</tt>
	 * @param mainView2  The mainView2 to set.
	 * @uml.property  name="mainView2"
	 */
	public void setMainView2(Design.MainView mainView2) {
		this.mainView2 = mainView2;
	}

}
