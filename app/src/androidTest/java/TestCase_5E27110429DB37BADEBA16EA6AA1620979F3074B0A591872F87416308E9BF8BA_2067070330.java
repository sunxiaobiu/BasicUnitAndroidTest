import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E27110429DB37BADEBA16EA6AA1620979F3074B0A591872F87416308E9BF8BA_2067070330 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      ProgressDialog var3 = new ProgressDialog(var2);
      Object var1 = EasyMock.createMock(TextView.class);
      var3.setCustomTitle((View)var1);
   }
}
