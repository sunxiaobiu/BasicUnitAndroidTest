import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatCallback;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A426B6E4A1DFA30D693F480193F158DF448A2B7DA487ECA255094A2A681F481_487341907 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      AppCompatDelegate var4 = AppCompatDelegate.create(var3, (AppCompatCallback)null);
      Object var1 = EasyMock.createMock(Bundle.class);
      var4.onPostCreate((Bundle)var1);
   }
}
