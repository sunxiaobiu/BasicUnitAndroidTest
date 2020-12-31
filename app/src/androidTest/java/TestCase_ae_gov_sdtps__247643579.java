import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_sdtps__247643579 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      Object var6 = var5.getSystemService("alarm");
      AlarmManager var7 = (AlarmManager)var6;
      long var1 = 1L;
      Object var3 = EasyMock.createMock(PendingIntent.class);
      var7.setRepeating(0, var1, 86400000L, (PendingIntent)var3);
   }

   public TestCase_ae_gov_sdtps__247643579() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
