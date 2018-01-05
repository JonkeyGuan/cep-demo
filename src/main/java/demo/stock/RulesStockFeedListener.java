package demo.stock;

import org.kie.api.runtime.rule.EntryPoint;

public class RulesStockFeedListener implements StockFeedListener {

	private EntryPoint ep;

	public RulesStockFeedListener(EntryPoint ep) {
		this.ep = ep;
	}

	@Override
	public void onTick(Tick tick) {
		ep.insert(tick);

	}

}
