package demo.stock;

public class LoggingStockFeedListener implements StockFeedListener {

	@Override
	public void onTick(Tick tick) {
		System.out.println(
				tick.getTimestamp() + ": " + tick.getSymbol() + ": " + tick.getShares() + "@" + tick.getPrice());
	}
}
