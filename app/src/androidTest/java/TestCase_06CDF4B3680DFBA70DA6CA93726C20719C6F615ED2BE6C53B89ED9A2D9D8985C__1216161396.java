import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_06CDF4B3680DFBA70DA6CA93726C20719C6F615ED2BE6C53B89ED9A2D9D8985C__1216161396 {
   @Test
   public void testCase() throws Exception {
      Object[] var2 = new Object[1];
      Object var3 = EasyMock.createMock(Object[].class);
      var3 = ((Object[])var3)[0];
      Activity var4 = (Activity)var3;
      Context var1 = (Context)var4;
      AppCompatTextView var6 = new AppCompatTextView(var1);
      Object var5 = EasyMock.createMock(LayoutParams.class);
      var6.setLayoutParams((LayoutParams)var5);
   }
}
