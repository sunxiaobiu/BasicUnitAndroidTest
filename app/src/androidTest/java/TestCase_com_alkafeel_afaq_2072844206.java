import android.content.Context;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alkafeel_afaq_2072844206 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      AppCompatDialog var2 = new AppCompatDialog(var1);
      Object var3 = EasyMock.createMock(View.class);
      var2.setContentView((View)var3);
   }
}
