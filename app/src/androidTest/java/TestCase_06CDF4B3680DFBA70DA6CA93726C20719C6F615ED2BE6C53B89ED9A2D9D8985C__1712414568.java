import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_06CDF4B3680DFBA70DA6CA93726C20719C6F615ED2BE6C53B89ED9A2D9D8985C__1712414568 {
   @Test
   public void testCase() throws Exception {
      Object[] var3 = new Object[1];
      Object var4 = EasyMock.createMock(Object[].class);
      var4 = ((Object[])var4)[0];
      Activity var5 = (Activity)var4;
      Context var1 = (Context)var5;
      AppCompatTextView var7 = new AppCompatTextView(var1);
      byte var6 = 1;
      byte var2 = 1;
      var7.setPadding(0, var6, 0, var2);
   }
}
