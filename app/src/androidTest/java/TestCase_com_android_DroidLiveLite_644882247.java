import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_android_DroidLiveLite_644882247 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = new ActivityTestRule(Activity.class);
      Activity var4 = var3.getActivity();
      ContentResolver var5 = var4.getContentResolver();
      ContentProviderClient var6 = var5.acquireContentProviderClient("com.android.DroidLiveLite.userdataprovider");
      Object var1 = EasyMock.createMock(Uri.class);
      Object var2 = EasyMock.createMock(ContentValues.class);
      var6.insert((Uri)var1, (ContentValues)var2);
   }
}
