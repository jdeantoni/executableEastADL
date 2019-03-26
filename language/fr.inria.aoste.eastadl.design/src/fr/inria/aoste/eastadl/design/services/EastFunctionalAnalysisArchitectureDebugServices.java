package fr.inria.aoste.eastadl.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocDebuggerServices;

public class EastFunctionalAnalysisArchitectureDebugServices extends AbstractGemocDebuggerServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {
		final List<StringCouple> res = new ArrayList<StringCouple>();

		res.add(new StringCouple("EAST_functional_analysis_architecture", "Debug"));

		return res;
	}

	@Override
	public String getModelIdentifier() {
		// TODO Auto-generated method stub
		return null;
	}

}
