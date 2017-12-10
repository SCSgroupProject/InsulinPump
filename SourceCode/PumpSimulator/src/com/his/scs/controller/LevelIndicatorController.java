package com.his.scs.controller;

import com.his.scs.model.LevelIndicatorModel;
import com.his.scs.view.LevelIndicatorView;

public class LevelIndicatorController {

	private LevelIndicatorView levelIndicatorView;
	private LevelIndicatorModel levelIndicatorModel;

	public LevelIndicatorController(LevelIndicatorView levelIndicatorView, LevelIndicatorModel levelIndicatorModel) {

		this.levelIndicatorView = levelIndicatorView;
		
		this.levelIndicatorModel = levelIndicatorModel;

	}

}
