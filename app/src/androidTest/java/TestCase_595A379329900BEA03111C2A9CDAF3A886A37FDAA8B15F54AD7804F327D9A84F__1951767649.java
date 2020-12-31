import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_595A379329900BEA03111C2A9CDAF3A886A37FDAA8B15F54AD7804F327D9A84F__1951767649 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      Object var1 = EasyMock.createMock(Intent.class);
      byte var2 = 1;
      var4.startActivityForResult((Intent)var1, var2, (Bundle)null);
   }

   public TestCase_595A379329900BEA03111C2A9CDAF3A886A37FDAA8B15F54AD7804F327D9A84F__1951767649() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
