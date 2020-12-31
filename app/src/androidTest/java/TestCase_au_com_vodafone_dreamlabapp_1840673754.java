import android.content.Context;
import android.support.v7.widget.AppCompatDrawableManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_vodafone_dreamlabapp_1840673754 {
   @Test
   public void testCase() throws Exception {
      AppCompatDrawableManager var3 = AppCompatDrawableManager.get();
      Object var1 = EasyMock.createMock(Context.class);
      byte var2 = 1;
      var3.getDrawable((Context)var1, var2);
   }
}
