import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.support.graphics.drawable.VectorDrawableCompat;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amboss_medical_knowledge_1271387150 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Resources var4 = var3.getResources();
      VectorDrawableCompat var5 = VectorDrawableCompat.create(var4, 2131230955, (Theme)null);
      Object var1 = EasyMock.createMock(PorterDuffColorFilter.class);
      var5.setColorFilter((ColorFilter)var1);
   }

   public TestCase_com_amboss_medical_knowledge_1271387150() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
