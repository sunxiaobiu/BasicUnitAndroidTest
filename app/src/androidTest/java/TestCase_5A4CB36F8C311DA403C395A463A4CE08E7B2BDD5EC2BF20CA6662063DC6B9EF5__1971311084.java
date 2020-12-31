import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.util.AttributeSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A4CB36F8C311DA403C395A463A4CE08E7B2BDD5EC2BF20CA6662063DC6B9EF5__1971311084 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Resources.class);
      Object var2 = null;
      Object var3 = EasyMock.createMock(AttributeSet.class);
      Object var4 = EasyMock.createMock(Theme.class);
      AnimatedVectorDrawableCompat.createFromXmlInner((Context)var0, (Resources)var1, (XmlPullParser)var2, (AttributeSet)var3, (Theme)var4);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
