import android.content.Context;
import android.support.v7.app.AppCompatDelegate;
import android.util.AttributeSet;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_witness_canacintra_yucatan__358113749 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(AppCompatDelegate.class);
      Object var1 = EasyMock.createMock(View.class);
      String var2 = "android";
      Object var3 = EasyMock.createMock(Context.class);
      Object var4 = EasyMock.createMock(AttributeSet.class);
      ((AppCompatDelegate)var5).createView((View)var1, var2, (Context)var3, (AttributeSet)var4);
   }
}
