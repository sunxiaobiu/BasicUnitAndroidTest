import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_au_gov_qld_deta_takeastand_562493587 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      ContentResolver var6 = var5.getContentResolver();
      Object var1 = EasyMock.createMock(Uri.class);
      Object var2 = EasyMock.createMock(ContentValues.class);
      String var3 = "android";
      var6.update((Uri)var1, (ContentValues)var2, var3, (String[])null);
   }

   public TestCase_air_au_gov_qld_deta_takeastand_562493587() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
