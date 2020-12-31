import android.app.Activity;
import android.media.RingtoneManager;
import android.net.Uri;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bartat_android_elixir__1475243114 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      RingtoneManager var3 = new RingtoneManager(var1);
      Object var4 = EasyMock.createMock(Uri.class);
      var3.getRingtonePosition((Uri)var4);
   }

   public TestCase_com_bartat_android_elixir__1475243114() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
