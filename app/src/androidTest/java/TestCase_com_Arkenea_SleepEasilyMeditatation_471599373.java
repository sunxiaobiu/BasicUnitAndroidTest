import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_Arkenea_SleepEasilyMeditatation_471599373 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      Object var1 = EasyMock.createMock(XmlResourceParser.class);
      ColorStateList.createFromXml((Resources)var0, (XmlPullParser)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
