import android.content.Context;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_610667BC8469194B9BF2E85A318C9549326CF12EE32279192C6540CC5D1987F2_1695081500 {
   @Test
   public void testCase() throws Exception {
      AppCompatDrawableManager var2 = AppCompatDrawableManager.get();
      Object var1 = EasyMock.createMock(Context.class);
      var2.onConfigurationChanged((Context)var1);
   }
}
