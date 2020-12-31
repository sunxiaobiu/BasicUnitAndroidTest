import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ShareCompat.IntentBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_auctionmobility_auctions_dnjlive__676288446 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      IntentBuilder var3 = IntentBuilder.from(var2);
      Intent var4 = var3.getIntent();
   }
}
